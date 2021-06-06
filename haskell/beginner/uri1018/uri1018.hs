module Main where

cells :: [Int]
cells = [100, 50, 20, 10, 5, 2, 1]

payback :: Int -> [Int] -> [Int]
payback _ [] = []
payback v (x : xs) = div v x : payback (mod v x) xs

showResult :: [String] -> IO ()
showResult [] = putStr ""
showResult (x : xs) = do
  putStrLn x
  showResult xs

main :: IO ()
main = do
  x <- readLn :: IO Int
  print x
  showResult $ zipWith (\a b -> show b ++ " nota(s) de R$ " ++ show a ++ ",00") cells (payback x cells)
