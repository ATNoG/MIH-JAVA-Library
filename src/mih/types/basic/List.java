//==============================================================================
// Brief   : LIST Data Type
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

package mih.types.basic;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import mih.types.Serializeable;

public class List<T extends Serializeable> extends ArrayList<T> implements
		Serializeable {

	public List(Class<T> type) {
		this.type = type;
	}

	public List(List<T> value) {
		this.type = value.type;
		clear();
		for (int i = 0; i < value.size(); ++i)
			add(value.get(i));
	}

	public void toBytes(ByteArrayOutputStream stream) throws Exception {
		stream.write(this.size());

		for (int i = 0; i < this.size(); ++i)
			this.get(i).toBytes(stream);
	}

	public void fromBytes(ByteArrayInputStream stream) throws Exception {
		int size = stream.read();

		for (int i = 0; i < size; ++i) {
			T item;
			try {
				item = (T) Class.forName(type.getName()).newInstance();
				item.fromBytes(stream);
				this.add(item);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private Class<T> type;
}