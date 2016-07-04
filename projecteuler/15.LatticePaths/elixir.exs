defmodule Recursion do
  def path_count(x, y) when x == 0 or y == 0 do
    1
  end

  def path_count(x, y) when x > 0 and y > 0 do
    path_count(x - 1, y) + path_count(x, y - 1)
  end
end

IO.puts(Recursion.path_count(21, 21))
