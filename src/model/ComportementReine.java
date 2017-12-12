package model;

public class ComportementReine implements ComportementDeplacement {

	/* (non-Javadoc)
	 * @see model.AbstractPiece#isMoveOk(int, int)
	 */
	@Override
	public boolean isMoveOk(int xInit, int yInit,int xFinal, int yFinal, boolean isCatchOk,
			boolean isCastlingPossible,boolean premierCoup) {
		
		boolean ret = false;
		
		if (Math.abs(yFinal - yInit) == Math.abs(xFinal - xInit)
				|| ((yFinal == yInit) || (xFinal == xInit))) {
			ret =  true;
		}
		
		return ret;
	}
}
