module Main where

ans :: Int -> IO ()
ans 0 = putStr ""
ans a = do
    putStrLn "I am Toorg!"
    ans (a - 1)

main :: IO ()
main = do
    x <- readLn :: IO Int
    ans x