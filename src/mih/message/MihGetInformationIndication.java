//==============================================================================
// Brief   : MIH_Get_Information Indication Message
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

import mih.tlvs.InfoQueryBinaryDataListTlv;
import mih.tlvs.InfoQueryRdfDataListTlv;
import mih.tlvs.InfoQueryRdfSchemaListTlv;
import mih.tlvs.InfoQueryRdfSchemaUrlTlv;
import mih.tlvs.MaxResponseSizeTlv;
import mih.tlvs.NetworkTypeTlv;
import mih.tlvs.UnauthenticatedInformationRequestTlv;
import mih.types.Serializeable;
import mih.types.basic.List;
import mih.types.basic.UnsignedInteger16;
import mih.types.general.Boolean;
import mih.types.informationelements.NetworkType;
import mih.types.informationservicequery.IqBinData;
import mih.types.informationservicequery.IqRdfData;
import mih.types.informationservicequery.IqRdfSchm;

public class MihGetInformationIndication extends Message implements
		Serializeable {

	public MihGetInformationIndication() {
		super();
		mid = MIH_Get_Information_indication;
		tlvList.add(new TlvInfo(new InfoQueryBinaryDataListTlv(), true));
		tlvList.add(new TlvInfo(new InfoQueryRdfDataListTlv(), true));
		tlvList.add(new TlvInfo(new InfoQueryRdfSchemaUrlTlv(), true));
		tlvList.add(new TlvInfo(new InfoQueryRdfSchemaListTlv(), true));
		tlvList.add(new TlvInfo(new MaxResponseSizeTlv(), true));
		tlvList.add(new TlvInfo(new NetworkTypeTlv(), true));
		tlvList.add(new TlvInfo(new UnauthenticatedInformationRequestTlv(), false));
	}

	public MihGetInformationIndication(int version, boolean ack_req,
			boolean ack_rsp, boolean uir, boolean m, int fn, boolean rsvd1,
			int rsvd2, int tid) {
		super(version, ack_req, ack_rsp, uir, m, fn, rsvd1,
				MIH_Get_Information_indication, rsvd2, tid);
		tlvList.add(new TlvInfo(new InfoQueryBinaryDataListTlv(), true));
		tlvList.add(new TlvInfo(new InfoQueryRdfDataListTlv(), true));
		tlvList.add(new TlvInfo(new InfoQueryRdfSchemaUrlTlv(), true));
		tlvList.add(new TlvInfo(new InfoQueryRdfSchemaListTlv(), true));
		tlvList.add(new TlvInfo(new MaxResponseSizeTlv(), true));
		tlvList.add(new TlvInfo(new NetworkTypeTlv(), true));
		tlvList.add(new TlvInfo(new UnauthenticatedInformationRequestTlv(), false));
	}

	public List<IqBinData> getInfoQueryBinaryDataListTlv() {
		return ((InfoQueryBinaryDataListTlv) tlvList.get(0).getTlv()).getValue();
	}

	public void setInfoQueryBinaryDataListTlv(List<IqBinData> value) {
		((InfoQueryBinaryDataListTlv) tlvList.get(0).getTlv()).setValue(value);
	}

	public List<IqRdfData> getInfoQueryRdfDataListTlv() {
		return ((InfoQueryRdfDataListTlv) tlvList.get(1).getTlv()).getValue();
	}

	public void setInfoQueryRdfDataListTlv(List<IqRdfData> value) {
		((InfoQueryRdfDataListTlv) tlvList.get(1).getTlv()).setValue(value);
	}

	public Boolean getInfoQueryRdfSchemaUrlTlv() {
		return ((InfoQueryRdfSchemaUrlTlv) tlvList.get(2).getTlv()).getValue();
	}

	public void setInfoQueryRdfSchemaUrlTlv(Boolean value) {
		((InfoQueryRdfSchemaUrlTlv) tlvList.get(2).getTlv()).setValue(value);
	}

	public List<IqRdfSchm> getInfoQueryRdfSchemaListTlv() {
		return ((InfoQueryRdfSchemaListTlv) tlvList.get(3).getTlv()).getValue();
	}

	public void setInfoQueryRdfSchemaListTlv(List<IqRdfSchm> value) {
		((InfoQueryRdfSchemaListTlv) tlvList.get(3).getTlv()).setValue(value);
	}

	public UnsignedInteger16 getMaxResponseSizeTlv() {
		return ((MaxResponseSizeTlv) tlvList.get(4).getTlv()).getValue();
	}

	public void setMaxResponseSizeTlv(UnsignedInteger16 value) {
		((MaxResponseSizeTlv) tlvList.get(4).getTlv()).setValue(value);
	}

	public NetworkType getNetworkTypeTlv() {
		return ((NetworkTypeTlv) tlvList.get(5).getTlv()).getValue();
	}

	public void setNetworkTypeTlv(NetworkType value) {
		((NetworkTypeTlv) tlvList.get(5).getTlv()).setValue(value);
	}

	public Boolean getUnauthenticatedInformationRequestTlv() {
		return ((UnauthenticatedInformationRequestTlv) tlvList.get(6).getTlv()).getValue();
	}

	public void setUnauthenticatedInformationRequestTlv(Boolean value) {
		((UnauthenticatedInformationRequestTlv) tlvList.get(6).getTlv()).setValue(value);
	}
}
