module Main where

processInput :: String -> String
processInput input = unlines [perLine line | line <- take 3 (lines input)]
  where
    perLine line = reverse line

main :: IO ()
main = do
  interact processInput
