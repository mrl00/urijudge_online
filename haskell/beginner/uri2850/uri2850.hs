module Main where

papagaio :: [Char] -> [Char]
papagaio s
  | s == "esquerda" = "ingles"
  | s == "direita" = "frances"
  | s == "nenhuma" = "portugues"
  | otherwise = "caiu"

main :: IO ()
main = getContents >>= mapM_ (putStrLn . papagaio) . lines
