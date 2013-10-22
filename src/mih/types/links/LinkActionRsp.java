//==============================================================================
// Brief   : LINK_ACTION_RSP Data Type
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
import mih.types.links.auxiliar.NullListLinkScanRspChoice;

public class LinkActionRsp
		extends
		Sequence<LinkId, LinkAcResult, NullListLinkScanRspChoice, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull>
		implements Serializeable {

	public LinkActionRsp(LinkId linkId, LinkAcResult linkAcResult, NullListLinkScanRspChoice linkScanRsp) {
		super(linkId, linkAcResult, linkScanRsp);
	}

	public LinkActionRsp(LinkActionRsp value) {
		super(value.getLinkId(), value.getLinkAcResult(), value.getLinkScanRsp());
	}

	public LinkActionRsp() {
		super(new LinkId(), new LinkAcResult(), new NullListLinkScanRspChoice());
	}

	public LinkId getLinkId() {
		return getA();
	}

	public void setLinkId(LinkId linkId) {
		setA(linkId);
	}

	public LinkAcResult getLinkAcResult() {
		return getB();
	}

	public void setLinkAcResult(LinkAcResult linkAcResult) {
		setB(linkAcResult);
	}

	public NullListLinkScanRspChoice getLinkScanRsp() {
		return getC();
	}

	public void setLinkScanRsp(NullListLinkScanRspChoice linkScanRsp) {
		setC(linkScanRsp);
	}
}
