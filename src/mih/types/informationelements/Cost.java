//==============================================================================
// Brief   : COST Data Type
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

public class Cost
		extends
		Sequence<CostUnit, CostValue, CostCurr, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull>
		implements Serializeable {

	public Cost(CostUnit costUnit, CostValue costValue, CostCurr costCurr) {
		super(costUnit, costValue, costCurr);
	}

	public Cost(Cost value) {
		super(value.getCostUnit(), value.getCostValue(), value.getCostCurr());
	}

	public Cost() {
		super(new CostUnit(), new CostValue(), new CostCurr());
	}

	public CostUnit getCostUnit() {
		return getA();
	}

	public void setCostUnit(CostUnit unit) {
		setA(unit);
	}

	public CostValue getCostValue() {
		return getB();
	}

	public void setCostValue(CostValue value) {
		setB(value);
	}

	public CostCurr getCostCurr() {
		return getC();
	}

	public void setCostCurr(CostCurr curr) {
		setC(curr);
	}
}
