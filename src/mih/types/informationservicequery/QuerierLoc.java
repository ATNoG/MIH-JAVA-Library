//==============================================================================
// Brief   : QUERIER_LOC Data Type
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

package mih.types.informationservicequery;

import mih.types.Serializeable;
import mih.types.basic.Sequence;
import mih.types.informationservicequery.auxiliar.NullLinkAddrChoice;
import mih.types.informationservicequery.auxiliar.NullLocationChoice;
import mih.types.informationservicequery.auxiliar.NullNghbRadiusChoice;

public class QuerierLoc
		extends
		Sequence<NullLocationChoice, NullLinkAddrChoice, NullNghbRadiusChoice, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull>
		implements Serializeable {

	public QuerierLoc(NullLocationChoice location, NullLinkAddrChoice linkAddr, NullNghbRadiusChoice nghbRadius) {
		super(location, linkAddr, nghbRadius);
	}

	public QuerierLoc(QuerierLoc value) {
		super(value.getLocation(), value.getLinkAddr(), value.getNghbRadius());
	}

	public QuerierLoc() {
		super(new NullLocationChoice(), new NullLinkAddrChoice(), new NullNghbRadiusChoice());
	}

	public NullLocationChoice getLocation() {
		return getA();
	}

	public void setLocation(NullLocationChoice location) {
		setA(location);
	}

	public NullLinkAddrChoice getLinkAddr() {
		return getB();
	}

	public void setLinkAddr(NullLinkAddrChoice linkAddr) {
		setB(linkAddr);
	}

	public NullNghbRadiusChoice getNghbRadius() {
		return getC();
	}

	public void setNghbRadius(NullNghbRadiusChoice nghbRadius) {
		setC(nghbRadius);
	}
}
