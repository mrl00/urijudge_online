module Main where

papagaio s	| s == "esquerda" = "ingles"
						| s == "direita" = "frances"
						| s == "nenhuma" = "portugues"
						| otherwise = "caiu"

main :: IO ()
main = do
	contents <- getContents
	mapM_ putStrLn $ map papagaio (lines contents)
