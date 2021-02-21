package org.asm.file;

public class VerificationUninitializedThisVariable extends Verification
{
	@Override
	public VerificationType getType()
	{
		return VerificationType.ITEM_UNINITIALIZED_THIS;
	}

	public byte[] toByteArray()
	{
		return new byte[]{6};
	}
}
