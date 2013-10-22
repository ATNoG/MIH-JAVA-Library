//==============================================================================
// Brief   : LINK_ACTION_REQ Data Type
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

package mih.types.links;

import mih.types.Serializeable;
import mih.types.basic.Sequence;
import mih.types.links.auxiliar.NullLinkAddrChoice;

public class LinkActionReq
		extends
		Sequence<LinkId, NullLinkAddrChoice, LinkAction, LinkAcExTime, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull>
		implements Serializeable {

	public LinkActionReq(LinkId linkId, NullLinkAddrChoice linkAddr, LinkAction linkAction, LinkAcExTime linkAcExTime) {
		super(linkId, linkAddr, linkAction, linkAcExTime);
	}

	public LinkActionReq(LinkActionReq value) {
		super(value.getLinkId(), value.getLinkAddr(), value.getLinkAction(), value.getLinkAcExTime());
	}

	public LinkActionReq() {
		super(new LinkId(), new NullLinkAddrChoice(), new LinkAction(), new LinkAcExTime());
	}

	public LinkId getLinkId() {
		return getA();
	}

	public void setLinkId(LinkId linkId) {
		setA(linkId);
	}

	public NullLinkAddrChoice getLinkAddr() {
		return getB();
	}

	public void setLinkAddr(NullLinkAddrChoice linkAddr) {
		setB(linkAddr);
	}

	public LinkAction getLinkAction() {
		return getC();
	}

	public void setLinkAction(LinkAction linkAction) {
		setC(linkAction);
	}

	public LinkAcExTime getLinkAcExTime() {
		return getD();
	}

	public void setLinkAcExTime(LinkAcExTime linkAcExTime) {
		setD(linkAcExTime);
	}
}
