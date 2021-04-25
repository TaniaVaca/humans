package co.com.mercadolibrer.humans.core;

public class Human {
	
	char [][] dna;
	
	public Human(String [] dna) {
		if (dna == null) {
			throw new NullPointerException();
		}
		// TODO more validations
		this.dna = new char[dna.length][];
		for (int i = 0; i < this.dna.length; i++) {
			this.dna[i] = dna[i].toCharArray();
		}
	}
	
	public boolean isMutant() {
		int n = dna.length;
		int numOfMutantSequences = 0; // TODO rename this variable
		// horizontal
		for (int i = 0; i < n; i++) {
			char prevChar = '\0';
			int times = 0;
			
			for (int j = 0; j < n; j++) {
				char currChar = dna[i][j];
				
				if (currChar == prevChar) {
					times++;
				} else {
					prevChar = currChar;
					times = 1;
				}
				
				if (times >= 4) {
					numOfMutantSequences++;
					if (numOfMutantSequences > 1) {
						return true;
					}
				}
			}
		}
		// vertical
		for (int j = 0; j < n; j++) {
			char prevChar = '\0';
			int times = 0;
			
			for (int i = 0; i < n; i++) {
				char currChar = dna[i][j];
				
				if (currChar == prevChar) {
					times++;
				} else {
					prevChar = currChar;
					times = 1;
				}
				
				if (times >= 4) {
					numOfMutantSequences++;
					if (numOfMutantSequences > 1) {
						return true;
					}
				}
			}
		}
		// diagonal
		numOfMutantSequences = diagonal(numOfMutantSequences);
		if (numOfMutantSequences > 1) {
			return true;
		}
		if (diagonal2(numOfMutantSequences) > 1) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param dna
	 * @param numOfMutantSequences
	 * @return
	 */
	public int diagonal(int numOfMutantSequences) {
		int n = this.dna.length;
		
		for (int pivotCol = 0; pivotCol < n; pivotCol++) {
			// for readability
			char prevChar = '\0';
			int times = 0;
			
			int row = 0;
			int col = pivotCol;
			while (col < n) {
				char currChar = this.dna[row][col];
				
				if (currChar == prevChar) {
					times++;
				} else {
					prevChar = currChar;
					times = 1;
				}
				
				if (times >= 4) {
					numOfMutantSequences++;
					if (numOfMutantSequences > 1) {
						return numOfMutantSequences;
					}
				}
				
				row++;
				col++;
			}
		}
		
		for (int pivotRow = 1; pivotRow < n; pivotRow++) {
			// for readability
			char prevChar = '\0';
			int times = 0;
			
			int row = pivotRow;
			int col = 0;
			while (row < n) {
				char currChar = this.dna[row][col];
				
				if (currChar == prevChar) {
					times++;
				} else {
					prevChar = currChar;
					times = 1;
				}
				
				if (times >= 4) {
					numOfMutantSequences++;
					if (numOfMutantSequences > 1) {
						return numOfMutantSequences;
					}
				}
				
				row++;
				col++;
			}
		}
		return numOfMutantSequences;
	}
	
	public int diagonal2(int numOfMutantSequences) {
		int n = this.dna.length;
		
		for (int pivotCol = 0; pivotCol < n; pivotCol++) {
			// for readability
			char prevChar = '\0';
			int times = 0;
			
			int row = 0;
			int col = pivotCol;
			while (col >= 0) {
				char currChar = this.dna[row][col];
				
				if (currChar == prevChar) {
					times++;
				} else {
					prevChar = currChar;
					times = 1;
				}
				
				if (times >= 4) {
					numOfMutantSequences++;
					if (numOfMutantSequences > 1) {
						return numOfMutantSequences;
					}
				}
				
				row++;
				col--;
			}
		}
		
		for (int pivotRow = 1; pivotRow < n; pivotRow++) {
			// for readability
			char prevChar = '\0';
			int times = 0;
			
			int row = pivotRow;
			int col = n - 1;
			while (row < n) {
				char currChar = this.dna[row][col];
				
				if (currChar == prevChar) {
					times++;
				} else {
					prevChar = currChar;
					times = 1;
				}
				
				if (times >= 4) {
					numOfMutantSequences++;
					if (numOfMutantSequences > 1) {
						return numOfMutantSequences;
					}
				}
				
				row++;
				col--;
			}
		}
		return numOfMutantSequences;
	}
}
