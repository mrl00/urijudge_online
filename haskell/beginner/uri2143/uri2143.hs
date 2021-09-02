module Main where

f :: [Int] -> [Int]
f [] = []
f (x:xs) = take x xs ++ f (drop x xs)

g :: Int -> Int
g n | even n = (n - 2)*2 + 2
    | otherwise = 2*n-1

rInt :: String -> Int
rInt = read

main :: IO ()
main = getContents >>= mapM_ (print . g) . f . (map rInt) . init . lines  
