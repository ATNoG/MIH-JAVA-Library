//==============================================================================
// Brief   : COST_VALUE Data Type
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

package mih.types.informationelements;

import mih.types.Serializeable;
import mih.types.basic.Sequence;
import mih.types.basic.UnsignedInteger16;
import mih.types.basic.UnsignedInteger32;

public class CostValue
		extends
		Sequence<UnsignedInteger32, UnsignedInteger16, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull>
		implements Serializeable {

	public CostValue(UnsignedInteger32 integer, UnsignedInteger16 fraction) {
		super(integer, fraction);
	}

	public CostValue(CostValue value) {
		super(value.getIntegerPart(), value.getFractionPart());
	}

	public CostValue() {
		super(new UnsignedInteger32(), new UnsignedInteger16());
	}

	public UnsignedInteger32 getIntegerPart() {
		return getA();
	}

	public void setIntegerPart(UnsignedInteger32 integer) {
		setA(integer);
	}

	public UnsignedInteger16 getFractionPart() {
		return getB();
	}

	public void setFractionPart(UnsignedInteger16 fraction) {
		setB(fraction);
	}
}
