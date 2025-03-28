public class RobotMonitor {
	public static final int MAX = 6;
	private static final int MIN_POS = 6;
	private int row;
	private int col;
	private Move lastMove;


	public RobotMonitor() {
		this.row = 1;
		this.col = 1;
		this.lastMove = null;
	}

	// Movement operations
	public void MoveRight() {
		if (col >= MAX) {
			throw new IllegalStateException("Cannot move right: already at column " + MAX);
		}
		if (lastMove == Move.RIGHT) {
			throw new IllegalStateException("Cannot repeat RIGHT move");
		}
		col++;
		lastMove = Move.RIGHT;
		validateState();
	}

	public void MoveLeft() {
		if (col <= MIN_POS) {
			throw new IllegalStateException("Cannot move left: already at column " + MIN_POS);
		}
		if (lastMove == Move.LEFT) {
			throw new IllegalStateException("Cannot repeat LEFT move");
		}
		col--;
		lastMove = Move.LEFT;
		validateState();
	}

	public void MoveUp() {
		if (row <= MIN_POS) {
			throw new IllegalStateException("Cannot move up: already at row " + MIN_POS);
		}
		if (lastMove == Move.UP) {
			throw new IllegalStateException("Cannot repeat UP move");
		}
		row--;
		lastMove = Move.UP;
		validateState();
	}

	public void MoveDown() {
		if (row >= MAX) {
			throw new IllegalStateException("Cannot move down: already at row " + MAX);
		}
		if (lastMove == Move.DOWN) {
			throw new IllegalStateException("Cannot repeat DOWN move");
		}
		row++;
		lastMove = Move.DOWN;
		validateState();
	}

	// Exit operation
	public void Exit() {
		if (row != MAX || col != MAX) {
			throw new IllegalStateException("Exit only allowed at (6, 6)");
		}
		row = 1;
		col = 1;
		lastMove = null;
		validateState();
	}

	// Getters
	public int GetRow() { return row; }
	public int GetCol() { return col; }
	public Move GetMove() { return lastMove; }

	// Validate invariant
	private void validateState() {
		if (row < MIN_POS || row > MAX || col < MIN_POS || col > MAX) {
			throw new IllegalStateException("Invalid position: (" + row + ", " + col + ")");
		}
	}
}
