//==============================================================================
// Brief   : LINK_STATUS_RSP Data Type
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
import mih.types.basic.List;
import mih.types.basic.Sequence;

public class LinkStatusRsp
		extends
		Sequence<List<LinkStatesRsp>, List<LinkParam>, List<LinkDescRsp>, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull>
		implements Serializeable {

	public LinkStatusRsp(List<LinkStatesRsp> linkStatesRspList, List<LinkParam> linkParamList, List<LinkDescRsp> linkDescRspList) {
		super(linkStatesRspList, linkParamList, linkDescRspList);
	}

	public LinkStatusRsp(LinkStatusRsp value) {
		super(value.getLinkStatesRspList(), value.getLinkParamList(), value.getLinkDescRspList());
	}

	public LinkStatusRsp() {
		super(new List<LinkStatesRsp>(LinkStatesRsp.class), new List<LinkParam>(LinkParam.class), new List<LinkDescRsp>(LinkDescRsp.class));
	}

	public List<LinkStatesRsp> getLinkStatesRspList() {
		return getA();
	}

	public void setLinkStatesRspList(List<LinkStatesRsp> linkStatesRspList) {
		setA(linkStatesRspList);
	}

	public List<LinkParam> getLinkParamList() {
		return getB();
	}

	public void setLinkParamList(List<LinkParam> linkParamList) {
		setB(linkParamList);
	}

	public List<LinkDescRsp> getLinkDescRspList() {
		return getC();
	}

	public void setLinkDescRspList(List<LinkDescRsp> linkDescRspList) {
		setC(linkDescRspList);
	}
}
