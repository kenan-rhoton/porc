(ns precalculated)

(def comb47
  [1
   47
   1081
   16215
   178365
   1533939])

(def possiblehands
  [[[] [0 1 2 3 4]]
   [[0] [1 2 3 4]]
   [[1] [0 2 3 4]]
   [[2] [0 1 3 4]]
   [[3] [0 1 2 4]]
   [[4] [0 1 2 3]]
   [[0 1] [2 3 4]]
   [[0 2] [1 3 4]]
   [[0 3] [1 2 4]]
   [[0 4] [1 2 3]]
   [[1 2] [0 3 4]]
   [[1 3] [0 2 4]]
   [[1 4] [0 2 3]]
   [[2 3] [0 1 4]]
   [[2 4] [0 1 3]]
   [[3 4] [0 1 2]]
   [[0 1 2] [3 4]]
   [[0 1 3] [2 4]]
   [[0 1 4] [2 3]]
   [[0 2 3] [1 4]]
   [[0 2 4] [1 3]]
   [[0 3 4] [1 2]]
   [[1 2 3] [0 4]]
   [[1 2 4] [0 3]]
   [[1 3 4] [0 2]]
   [[2 3 4] [0 1]]
   [[0 1 2 3] [4]]
   [[0 1 2 4] [3]]
   [[0 1 3 4] [2]]
   [[0 2 3 4] [1]]
   [[1 2 3 4] [0]]
   [[0 1 2 3 4] []]])
