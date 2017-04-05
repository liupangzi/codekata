package main

func main() {
	a, b, i, result := 1, 2, 0, 2
	for {
		for count := 0; count < 3; count++ {
			i = a + b
			a = b
			b = i
		}

		if i <= 4000000 {
			result += i
		} else {
			break
		}
	}
	println(result)
}

