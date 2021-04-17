module Main where

import Control.Monad
import Text.Printf
import Data.List 

notes :: [Int]
notes = [100, 50, 20, 10, 5, 2, 1]

coins :: [Int]
coins = [50, 25, 10, 5, 1]

dcoins :: [Double]
dcoins = [1.0, 0.5, 0.25, 0.1, 0.05, 0.01]

payback :: (Integral a) => a -> [a] -> [a]
payback _ [] = []
payback v (x:xs) = (div v x) : payback (mod v x) xs

formatInput :: String -> [Int]
formatInput str =
   let splitInput = splitAt (('.' `elemIndices` str) !! 0) str
       x1 = read (fst splitInput) :: Int
       x2 = read (delete '.' (snd splitInput)) :: Int
   in  [x1,x2] 

main :: IO ()
main = do
   s <- getLine
   let [x1,x2] = formatInput s
   let y = (payback x1 notes) ++ (payback x2 coins)
   putStrLn "NOTAS:"
   putStr . unlines $ map showNotes (zip (take 6 y) notes)
   putStrLn "MOEDAS:"
   putStr . unlines $ map showCoins (zip (drop 6 y) dcoins)
   where showNotes (a,b) = printf "%d nota(s) de R$ %d.00" a b
         showCoins (a,b) = printf "%d moeda(s) de R$ %.2f" a b 




