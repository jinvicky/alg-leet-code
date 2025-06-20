from collections import deque

class Solution(object):
    def nearestExit(self, maze, entrance):
        rows = len(maze)
        columns = len(maze[0])
        queue = deque()
        queue.append(entrance)
        maze[entrance[0]][entrance[1]] = '+'

        directions = [[0,1], [0,-1], [1,0], [-1,0]]
        steps = 0

        while queue:
            steps += 1
            for _ in range(len(queue)):
                current = queue.popleft()
                for direction in directions:
                    x = current[0] + direction[0]
                    y = current[1] + direction[1]

                    if x < 0 or x >= rows or y < 0 or y >= columns:
                        continue
                    if maze[x][y] == '+':
                        continue
                    if x == 0 or x == rows - 1 or y == 0 or y == columns - 1:
                        return steps
                    maze[x][y] = '+'
                    queue.append([x, y])
        return -1
