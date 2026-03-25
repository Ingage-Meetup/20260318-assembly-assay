const fs = require("fs");

function sortChars(line) {
    return line.replace(/,/g, "").split("").sort().join(" ");
}

if (require.main === module) {
    const path = process.argv[2] ?? "input.csv";
    const lines = fs.readFileSync(path, "utf8").split("\n");

    for (const line of lines) {
        console.log(line);
    }
}

module.exports = { sortChars };
