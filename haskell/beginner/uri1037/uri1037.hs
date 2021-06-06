module Main where

interval :: Double -> IO ()
interval x
  | x >= 0 && x <= 25 = putStrLn "Intervalo [0,25]"
  | x > 25 && x <= 50 = putStrLn "Intervalo (25,50]"
  | x > 50 && x <= 75 = putStrLn "Intervalo (50,75]"
  | x > 75 && x <= 100 = putStrLn "Intervalo (75,100]"
  | otherwise = putStrLn "Fora de intervalo"

main :: IO ()
main = do
  x <- getLine
  let number = read x :: Double
  interval number
