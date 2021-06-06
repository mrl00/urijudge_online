module Main where

main :: IO ()
main = do
  min <- readLn :: IO Int
  x <- getLine
  let [a, b] = map read (words x) :: [Int]
  if (a + b) > min
    then putStrLn "Deixa para amanha!"
    else putStrLn "Farei hoje!"