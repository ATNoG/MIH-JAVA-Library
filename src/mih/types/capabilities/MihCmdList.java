//==============================================================================
// Brief   : MIH_CMD_LIST Data Type
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

package mih.types.capabilities;

import mih.types.Serializeable;
import mih.types.basic.Bitmap;

public class MihCmdList extends Bitmap implements Serializeable {

	public enum MihCmdListEnum {
		 MihLinkGetParameters(0),
		 MihLinkConfigureThresholds(1),
		 MihLinkActions(2),
		 MihNetHoCandidateQuery(3),
		 MihNetHoCommit(3),
		 MihN2NHoQueryResources(3),
		 MihN2NHoCommit(3),
		 MihN2NHoComplete(3),
		 MihMnHoCandidateQuery(4),
		 MihMnHoCommit(4),
		 MihMnHoComplete(4);

		 private MihCmdListEnum(int id) {
			 this.id = id;
		 }

		 public final int id;
	}

	public MihCmdList(MihCmdListEnum value) {
		super(32);
		set(value.id);
	}

	public MihCmdList(MihCmdList value) {
		super(value);
	}

	public MihCmdList() {
		super(32);
	}
}