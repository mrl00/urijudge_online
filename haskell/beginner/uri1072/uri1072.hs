module Main where

main = do
    interact processInput
    
processInput input = unlines [perLine line | line <- take 3 (lines input)]
    where perLine line = reverse line



