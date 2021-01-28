module Main where

data Point = Point Double Double deriving (Show, Eq)

manhattan :: Point -> Point -> Double
manhattan (Point x y) (Point w u) = abs (x - w) + abs (y - u)

xFp :: [Point] -> [Double]
xFp [] = []
xFp ((Point x _):ps) = x : xFp ps

yFp :: [Point] -> [Double]
yFp [] = []
yFp ((Point _ y):ps) = y : yFp ps

p2a :: [Point] -> ([Double], [Double])
p2a points@(p:ps) = (xFp points, yFp points)



main :: IO ()
main = do
   print "Hello"
