using System;
using System.IO;

string path = args.Length > 0 ? args[0] : "input.csv";
foreach (string line in File.ReadAllLines(path))
{
    Console.WriteLine(line);
}
