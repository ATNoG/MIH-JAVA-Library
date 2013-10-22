//==============================================================================
// Brief   : PK_LOSS_RATE Data Type
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

package mih.types.qos;

import mih.types.Serializeable;
import mih.types.basic.Sequence;
import mih.types.basic.UnsignedInteger16;

public class PkLossRate
		extends
		Sequence<CosId, UnsignedInteger16, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull>
		implements Serializeable {

	public PkLossRate(CosId cos, UnsignedInteger16 value) {
		super(cos, value);
	}

	public PkLossRate(PkLossRate value) {
		super(value.getCosId(), value.getValue());
	}

	public PkLossRate() {
		super(new CosId(), new UnsignedInteger16());
	}

	public CosId getCosId() {
		return getA();
	}

	public void setType(CosId cos) {
		setA(cos);
	}

	public UnsignedInteger16 getValue() {
		return getB();
	}

	public void setValue(UnsignedInteger16 attr) {
		setB(attr);
	}
}
