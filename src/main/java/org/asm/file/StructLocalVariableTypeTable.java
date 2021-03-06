package org.asm.file;

public class StructLocalVariableTypeTable
{
	private short startPc;
	private short length;
	private short nameIndex;
	private short signatureIndex;
	private short index;

	public short getStartPc()
	{
		return startPc;
	}

	public void setStartPc(short startPc)
	{
		this.startPc = startPc;
	}

	public short getLength()
	{
		return length;
	}

	public void setLength(short length)
	{
		this.length = length;
	}

	public short getNameIndex()
	{
		return nameIndex;
	}

	public void setNameIndex(short nameIndex)
	{
		this.nameIndex = nameIndex;
	}

	public short getSignatureIndex()
	{
		return signatureIndex;
	}

	public void setSignatureIndex(short signatureIndex)
	{
		this.signatureIndex = signatureIndex;
	}

	public short getIndex()
	{
		return index;
	}

	public void setIndex(short index)
	{
		this.index = index;
	}

	public byte[] toByteArray()
	{
		byte[] b = new byte[10];
		b[0] = (byte) ((this.startPc >>> 8) & 0XFF);
		b[1] = (byte) (this.startPc & 0XFF);
		b[2] = (byte) ((this.length >>> 8) & 0XFF);
		b[3] = (byte) (this.length & 0XFF);
		b[4] = (byte) ((this.nameIndex >>> 8) & 0XFF);
		b[5] = (byte) (this.nameIndex & 0XFF);
		b[6] = (byte) ((this.signatureIndex >>> 8) & 0XFF);
		b[7] = (byte) (this.signatureIndex & 0XFF);
		b[8] = (byte) ((this.index >>> 8) & 0XFF);
		b[9] = (byte) (this.index & 0XFF);
		return b;
	}
}
