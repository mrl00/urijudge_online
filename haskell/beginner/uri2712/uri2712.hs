module Main where

import Data.Char
import Data.List

days :: Int -> String
days = (["MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY"] !!)


validade all@(x:xs) | length all == 8 = test
                    | otherwise = False
  where
    isnumbers = and $ map isAsciiUpper (take 3 all)
    isalpha = and $ map isNumber (drop 4 all)
    hif = all !! 3 == '-'
    test = and [isnumbers, isalpha, hif]



ml :: String -> String
ml s | validade s = mmm (read [last s] :: Int)
     | otherwise = "FAILURE"
   where mmm x | x `elem` [1,2] = days 0
               | x `elem` [3,4] = days 1
               | x `elem` [5,6] = days 2
               | x `elem` [7,8] = days 3
               | x `elem` [9,0] = days 4
               | otherwise = "FAILURE"

main :: IO ()
main = do
   contents <- getContents
   mapM_ putStrLn $ map ml (tail $ lines contents)
