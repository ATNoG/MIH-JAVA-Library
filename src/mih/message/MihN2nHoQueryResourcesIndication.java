//==============================================================================
// Brief   : MIH_N2N_HO_Query_Resources Indication Message
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

import mih.tlvs.AccessRouterAddressTlv;
import mih.tlvs.DhcpServerAddressTlv;
import mih.tlvs.FaAddressTlv;
import mih.tlvs.HandoverResourceQueryListTlv;
import mih.tlvs.IpAddressConfigurationMethodsTlv;
import mih.tlvs.LinkIdentifierListTlv;
import mih.types.Serializeable;
import mih.types.address.IpAddr;
import mih.types.basic.List;
import mih.types.ipconfiguration.IpCfgMthds;
import mih.types.links.LinkId;
import mih.types.qos.QosList;

public class MihN2nHoQueryResourcesIndication extends Message implements
		Serializeable {

	public MihN2nHoQueryResourcesIndication() {
		super();
		mid = MIH_N2N_HO_Query_Resoures_indication;
		tlvList.add(new TlvInfo(new HandoverResourceQueryListTlv(), false));
		tlvList.add(new TlvInfo(new IpAddressConfigurationMethodsTlv(), true));
		tlvList.add(new TlvInfo(new DhcpServerAddressTlv(), true));
		tlvList.add(new TlvInfo(new FaAddressTlv(), true));
		tlvList.add(new TlvInfo(new AccessRouterAddressTlv(), true));
		tlvList.add(new TlvInfo(new LinkIdentifierListTlv(), true));
	}

	public MihN2nHoQueryResourcesIndication(int version, boolean ack_req,
			boolean ack_rsp, boolean uir, boolean m, int fn, boolean rsvd1,
			int rsvd2, int tid) {
		super(version, ack_req, ack_rsp, uir, m, fn, rsvd1,
				MIH_N2N_HO_Query_Resoures_indication, rsvd2, tid);
		tlvList.add(new TlvInfo(new HandoverResourceQueryListTlv(), false));
		tlvList.add(new TlvInfo(new IpAddressConfigurationMethodsTlv(), true));
		tlvList.add(new TlvInfo(new DhcpServerAddressTlv(), true));
		tlvList.add(new TlvInfo(new FaAddressTlv(), true));
		tlvList.add(new TlvInfo(new AccessRouterAddressTlv(), true));
		tlvList.add(new TlvInfo(new LinkIdentifierListTlv(), true));
	}

	public QosList getHandoverResourceQueryListTlv() {
		return ((HandoverResourceQueryListTlv) tlvList.get(0).getTlv()).getValue();
	}

	public void setHandoverResourceQueryListTlv(QosList value) {
		((HandoverResourceQueryListTlv) tlvList.get(0).getTlv()).setValue(value);
	}

	public boolean hasIpAddressConfigurationMethodsTlv() {
		return tlvList.get(1).getTlv().isInitialized();
	}

	public IpCfgMthds getIpAddressConfigurationMethodsTlv() {
		return ((IpAddressConfigurationMethodsTlv) tlvList.get(1).getTlv()).getValue();
	}

	public void setIpAddressConfigurationMethodsTlv(IpCfgMthds value) {
		((IpAddressConfigurationMethodsTlv) tlvList.get(1).getTlv()).setValue(value);
	}

	public boolean hasDhcpServerAddressTlv() {
		return tlvList.get(2).getTlv().isInitialized();
	}

	public IpAddr getDhcpServerAddressTlv() {
		return ((DhcpServerAddressTlv) tlvList.get(2).getTlv()).getValue();
	}

	public void setDhcpServerAddressTlv(IpAddr value) {
		((DhcpServerAddressTlv) tlvList.get(2).getTlv()).setValue(value);
	}

	public boolean hasFaAddressTlv() {
		return tlvList.get(3).getTlv().isInitialized();
	}

	public IpAddr getFaAddressTlv() {
		return ((FaAddressTlv) tlvList.get(3).getTlv()).getValue();
	}

	public void setFaAddressTlv(IpAddr value) {
		((FaAddressTlv) tlvList.get(3).getTlv()).setValue(value);
	}

	public boolean hasAccessRouterAddressTlv() {
		return tlvList.get(4).getTlv().isInitialized();
	}

	public IpAddr getAccessRouterAddressTlv() {
		return ((AccessRouterAddressTlv) tlvList.get(4).getTlv()).getValue();
	}

	public void setAccessRouterAddressTlv(IpAddr value) {
		((AccessRouterAddressTlv) tlvList.get(4).getTlv()).setValue(value);
	}

	public boolean hasLinkIdentifierListTlv() {
		return tlvList.get(5).getTlv().isInitialized();
	}

	public List<LinkId> getLinkIdentifierListTlv() {
		return ((LinkIdentifierListTlv) tlvList.get(5).getTlv()).getValue();
	}

	public void setLinkIdentifierListTlv(List<LinkId> value) {
		((LinkIdentifierListTlv) tlvList.get(5).getTlv()).setValue(value);
	}
}
