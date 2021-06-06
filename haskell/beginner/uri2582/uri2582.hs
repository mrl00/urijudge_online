module Main where

musics :: Int -> [Char]
musics = (["PROXYCITY", "P.Y.N.G.", "DNSUEY!", "SERVERS", "HOST!", "CRIPTONIZE", "OFFLINE DAY", "SALT", "ANSWER!", "RAR?", "WIFI ANTENNAS"] !!)

selMusic :: Int -> Int -> String
selMusic a b = musics $ (a + b) `mod` 11

ans :: Int -> IO ()
ans 0 = putStr ""
ans n = do
  input <- getLine
  let [a, b] = map read (words input) :: [Int]
  putStrLn $ selMusic a b
  ans (n - 1)

main :: IO ()
main = do
  x <- readLn :: IO Int
  ans x