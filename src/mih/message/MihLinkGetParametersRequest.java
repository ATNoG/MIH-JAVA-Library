//==============================================================================
// Brief   : MIH_Link_Get_Parameters Request Message
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

package mih.message;

import mih.tlvs.DeviceStatesRequestTlv;
import mih.tlvs.GetStatusRequestSetTlv;
import mih.tlvs.LinkIdentifierListTlv;
import mih.types.Serializeable;
import mih.types.basic.List;
import mih.types.links.DevStatesReq;
import mih.types.links.LinkId;
import mih.types.links.LinkStatusReq;

public class MihLinkGetParametersRequest extends Message implements
		Serializeable {

	public MihLinkGetParametersRequest() {
		super();
		mid = MIH_Link_Get_Parameters_request;
		tlvList.add(new TlvInfo(new DeviceStatesRequestTlv(), true));
		tlvList.add(new TlvInfo(new LinkIdentifierListTlv(), false));
		tlvList.add(new TlvInfo(new GetStatusRequestSetTlv(), false));
	}

	public MihLinkGetParametersRequest(int version, boolean ack_req,
			boolean ack_rsp, boolean uir, boolean m, int fn, boolean rsvd1,
			int rsvd2, int tid) {
		super(version, ack_req, ack_rsp, uir, m, fn, rsvd1,
				MIH_Link_Get_Parameters_request, rsvd2, tid);
		tlvList.add(new TlvInfo(new DeviceStatesRequestTlv(), true));
		tlvList.add(new TlvInfo(new LinkIdentifierListTlv(), false));
		tlvList.add(new TlvInfo(new GetStatusRequestSetTlv(), false));
	}

	public boolean hasDeviceStatesRequestTlv() {
		return tlvList.get(0).getTlv().isInitialized();
	}

	public DevStatesReq getDeviceStatesRequestTlv() {
		return ((DeviceStatesRequestTlv) tlvList.get(0).getTlv()).getValue();
	}

	public void setDeviceStatesRequestTlv(DevStatesReq value) {
		((DeviceStatesRequestTlv) tlvList.get(0).getTlv()).setValue(value);
	}

	public List<LinkId> getLinkIdentifierListTlv() {
		return ((LinkIdentifierListTlv) tlvList.get(1).getTlv()).getValue();
	}

	public void setLinkIdentifierListTlv(List<LinkId> value) {
		((LinkIdentifierListTlv) tlvList.get(1).getTlv()).setValue(value);
	}

	public LinkStatusReq getGetStatusRequestSetTlv() {
		return ((GetStatusRequestSetTlv) tlvList.get(2).getTlv()).getValue();
	}

	public void setGetStatusRequestSetTlv(LinkStatusReq value) {
		((GetStatusRequestSetTlv) tlvList.get(2).getTlv()).setValue(value);
	}
}
