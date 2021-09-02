module Main where

lc :: (Ord p, Num p) => [p] -> p
lc [l, c]
  | l > c = c
  | otherwise = 0

main :: IO ()
main = do
  contents <- getContents
  putStrLn $ show $ sum $ map lc $ map (map read) $ map words (tail $ lines contents)
