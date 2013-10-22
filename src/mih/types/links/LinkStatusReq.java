//==============================================================================
// Brief   : LINK_STATUS_REQ Data Type
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

public class LinkStatusReq
		extends
		Sequence<LinkStatesReq, List<LinkParamType>, LinkDescReq, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull, Sequence.ObjectNull>
		implements Serializeable {

	public LinkStatusReq(LinkStatesReq linkStatesReq, List<LinkParamType> linkParamTypeList, LinkDescReq linkDescReq) {
		super(linkStatesReq, linkParamTypeList, linkDescReq);
	}

	public LinkStatusReq(LinkStatusReq value) {
		super(value.getLinkStatesReq(), value.getLinkParamTypeList(), value.getLinkDescReq());
	}

	public LinkStatusReq() {
		super(new LinkStatesReq(), new List<LinkParamType>(LinkParamType.class), new LinkDescReq());
	}

	public LinkStatesReq getLinkStatesReq() {
		return getA();
	}

	public void setLinkStatesReq(LinkStatesReq linkStatesReq) {
		setA(linkStatesReq);
	}

	public List<LinkParamType> getLinkParamTypeList() {
		return getB();
	}

	public void setLinkParamTypeList(List<LinkParamType> linkParamTypeList) {
		setB(linkParamTypeList);
	}

	public LinkDescReq getLinkDescReq() {
		return getC();
	}

	public void setLinkDescReq(LinkDescReq linkDescReq) {
		setC(linkDescReq);
	}
}
