//==============================================================================
// Brief   : Generic TLV
// Authors : Carlos Guimarães <cguimaraes@av.it.pt>
//------------------------------------------------------------------------------
// ODTONE - Open Dot Twenty One
//
// Copyright (C) 2013 Universidade Aveiro
// Copyright (C) 2013 Instituto de Telecomunicações - Pólo Aveiro
//
// This file is part of MIH-JAVA-Library.
//
// MIH-JAVA-Library is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 2.1 of the License, or
// (at your option) any later version.
//
// MIH-JAVA-Library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with MIH-JAVA-Library. If not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
//==============================================================================

package mih.tlvs;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import mih.types.Serializeable;
import mih.types.basic.UnsignedInteger8;

public abstract class Tlv<T extends Serializeable> implements Serializeable {

	public Tlv(UnsignedInteger8 tag) {
		this.tag = tag;
		hasValue = false;
	}

	public Tlv(UnsignedInteger8 tag, T value) {
		this.tag = tag;
		this.value = value;
		this.hasValue = true;
	}

	public UnsignedInteger8 getTag() {
		return tag;
	}

	public void setTag(UnsignedInteger8 tag) {
		this.tag = tag;
	}

	public UnsignedInteger8 getLength() {
		return length;
	}

	public void setLength(UnsignedInteger8 length) {
		this.length = length;
	}

	public T getValue() {
		if(hasValue)
			return value;
		else
			return null;
	}

	public void setValue(T value) {
		this.value = value;
		this.hasValue = true;
	}

	public boolean isInitialized() {
		return hasValue;
	}

	public void toBytes(ByteArrayOutputStream stream) throws Exception {
		if(hasValue) {
			ByteArrayOutputStream tmp = new ByteArrayOutputStream();
			value.toBytes(tmp);
			length.setValue(tmp.size());

			tag.toBytes(stream);
			length.toBytes(stream);
			value.toBytes(stream);
		}
	}

	public void fromBytes(ByteArrayInputStream stream) throws Exception {
		stream.mark(0);
		int tagRead = stream.read();
		stream.reset();

		if(tag.getValue() == tagRead) {
			tag.fromBytes(stream);
			length.fromBytes(stream);
			value.fromBytes(stream);
			hasValue = true;
		}
	}

	boolean hasValue;
	UnsignedInteger8 tag;
	UnsignedInteger8 length = new UnsignedInteger8(-1);
	T value;
}
