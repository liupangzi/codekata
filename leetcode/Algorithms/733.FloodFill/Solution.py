class Solution:
    def floodFill(self, image, sr, sc, newColor):
        """
        :type image: List[List[int]]
        :type sr: int
        :type sc: int
        :type newColor: int
        :rtype: List[List[int]]
        """
        if image[sr][sc] != newColor:
            self.helper(image, sr, sc, newColor, image[sr][sc])
        return image

    def helper(self, image, sr, sc, newColor, origin):
        image[sr][sc] = newColor
        if sr != 0 and image[sr - 1][sc] == origin:
            self.helper(image, sr - 1, sc, newColor, origin)
        if sc != 0 and image[sr][sc - 1] == origin:
            self.helper(image, sr, sc - 1, newColor, origin)
        if sr != len(image) - 1 and image[sr + 1][sc] == origin:
            self.helper(image, sr + 1, sc, newColor, origin)
        if sc != len(image[0]) - 1 and image[sr][sc + 1] == origin:
            self.helper(image, sr, sc + 1, newColor, origin)

