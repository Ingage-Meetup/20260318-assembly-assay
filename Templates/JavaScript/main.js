const fs = require("fs");

const path = process.argv[2] ?? "input.csv";
const lines = fs.readFileSync(path, "utf8").split("\n");

for (const line of lines) {
    console.log(line);
}
