module Main where

data Point = Point Int Int

origin :: Point
origin = Point 0 0

manhattan :: Point -> Point -> Int
manhattan (Point x1 y1) (Point x2 y2) = abs (x1 - x2) + abs (y1 - y2)

rInt :: String -> Int
rInt = read

main :: IO ()
main = do
  getContents >>= print . map (map rInt . words) . lines