//==============================================================================
// Brief   : 3GPP_3G_CELL_ID Data Type
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

package mih.types.address;

import mih.types.Serializeable;
import mih.types.basic.Sequence;

public class ThreeGpp3GCellId
		extends
		Sequence<PlmnId, CellId, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull>
		implements Serializeable {

	public ThreeGpp3GCellId(PlmnId plmn, CellId cell) {
		super(plmn, cell);
	}

	public ThreeGpp3GCellId(ThreeGpp3GCellId value) {
		super(value.getPlmnID(), value.getCellID());
	}

	public ThreeGpp3GCellId() {
		super(new PlmnId(), new CellId());
	}

	public PlmnId getPlmnID() {
		return getA();
	}

	public void setPlmnID(PlmnId plmn) {
		setA(plmn);
	}

	public CellId getCellID() {
		return getB();
	}

	public void setCellID(CellId cell) {
		setB(cell);
	}
}