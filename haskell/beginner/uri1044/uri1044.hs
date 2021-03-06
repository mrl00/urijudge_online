module Main where

mult :: Integral a => a -> a -> Bool
mult a b = mod a b == 0 || mod b a == 0

main :: IO ()
main = do
  input <- getLine
  let [a, b] = map read (words input) :: [Int]
  if mult a b
    then putStrLn "Sao Multiplos"
    else putStrLn "Nao sao Multiplos"
