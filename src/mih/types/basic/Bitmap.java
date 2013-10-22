//==============================================================================
// Brief   : BITMAP Data Type
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

package mih.types.basic;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import mih.types.Serializeable;

public class Bitmap implements Serializeable {
	/**
	 * Construct an empty BITMAP data type.
	 */
	public Bitmap(int size) {
		assert (size % 8 == 0);

		bitmap = new byte[size / 8];
	}

	/**
	 * Construct an empty BITMAP data type.
	 */
	public Bitmap(Bitmap b) {
		assert (bitmap.length == b.bitmap.length);

		for (int i = 0; i < bitmap.length; ++i)
			bitmap[i] = b.bitmap[i];
	}

	/**
	 * Clear the BITMAP data type.
	 */
	public void clear() {
		for (int i = 0; i < bitmap.length; ++i)
			bitmap[i] = 0x00;
	}

	/**
	 * Clear the position.
	 *
	 * @param pos
	 *            The position on the bitmap to clear.
	 */
	public void clear(int pos) {
		bitmap[pos / 8] &= ~(1 << (pos % 8));
	}

	/**
	 * Set the position.
	 *
	 * @param pos
	 *            The position on the bitmap to set.
	 */
	public void set(int pos) {
		bitmap[pos / 8] |= (1 << (pos % 8));
	}

	/**
	 * Get the position value.
	 *
	 * @param pos
	 *            The position on the bitmap to get.
	 */
	public boolean get(int pos) {
		return ((bitmap[pos / 8] & (1 << (pos % 8)))) == 1;
	}

	public void toBytes(ByteArrayOutputStream stream) {
		for(int i = 0; i < bitmap.length; ++i)
			stream.write(bitmap[i]);
	}

	public void fromBytes(ByteArrayInputStream stream) {
		for(int i = 0; i < bitmap.length; ++i) {
			bitmap[i] = (byte) stream.read();
		}
	}

	private byte bitmap[];
}