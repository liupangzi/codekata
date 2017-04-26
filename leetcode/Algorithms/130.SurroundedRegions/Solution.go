func solve(board [][]byte) {
	if len(board) == 0 {
		return
	}

	height, length := len(board), len(board[0])
	queue := make([]int, 0)

	for i := 0; i < length; i++ {
		if board[0][i] == 'O' {
			queue = append(queue, 0, i)
		}
		if board[height-1][i] == 'O' {
			queue = append(queue, height-1, i)
		}
	}

	for j := 1; j < height-1; j++ {
		if board[j][0] == 'O' {
			queue = append(queue, j, 0)
		}
		if board[j][length-1] == 'O' {
			queue = append(queue, j, length-1)
		}
	}

	for len(queue) != 0 {
		x, y := queue[0], queue[1]
		queue = queue[2:]
		if board[x][y] == 'O' {
			board[x][y] = 'V'
			if x > 0 && board[x-1][y] == 'O' {
				queue = append(queue, x-1, y)
			}
			if y > 0 && board[x][y-1] == 'O' {
				queue = append(queue, x, y-1)
			}
			if x+1 < height && board[x+1][y] == 'O' {
				queue = append(queue, x+1, y)
			}
			if y+1 < length && board[x][y+1] == 'O' {
				queue = append(queue, x, y+1)
			}
		}
	}

	for i := 0; i < height; i++ {
		for j := 0; j < length; j++ {
			if board[i][j] == 'O' {
				board[i][j] = 'X'
			}
			if board[i][j] == 'V' {
				board[i][j] = 'O'
			}
		}
	}
}

