module Main where

reindeer :: Int -> String
reindeer = (["Rudolph", "Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"] !!)

main :: IO ()
main = do
    input <- getLine
    putStrLn $ reindeer $ sum (map read (words input) :: [Int]) `mod` 9
    