module Main where

import Data.Char (isNumber)

catchChar :: Int -> Char
catchChar = (['a' .. 'z'] !!)

getIndex :: String -> Int
getIndex s =
  let degree = (* 3) $ length (words s)
      pos = length $ head (words s)
   in degree - abs (pos - 3) - 1

chck :: [String] -> [String]
chck all@(l : ls) = [m | m <- all, not $ isANumber m]
  where
    isANumber (s : ss) = foldl (\acc x -> acc && isNumber x) True (s : ss)

charToString :: Char -> String
charToString = (: [])

main :: IO ()
main = getContents >>= mapM_ (putStrLn . charToString . catchChar . getIndex) . chck . lines
