module Main where

import Text.Regex.TDFA

days :: Int -> String
days = (["MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY"] !!)

ml :: String -> String
ml s | (s =~ "(^[A-Z]{3}-[0-9]{4}$)" :: Bool) = mmm (read [last s] :: Int)
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
