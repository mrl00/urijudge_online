module Main where

toBinary :: Integer -> [Integer]
toBinary 0 = [0]
toBinary n = toBinary (n `quot` 2) ++ [n `rem` 2]

cs :: Int -> [Integer] -> [Int]
cs n [] = [n]
cs n (x : xs)
  | x == 1 = cs (n + 1) xs
  | otherwise = n : cs 0 xs

main :: IO ()
main = do
  contents <- getContents
  let x = map (maximum . (cs 0 . toBinary)) (map read (tail $ lines contents) :: [Integer])
  mapM_ print x
