const { test } = require("node:test");
const assert = require("node:assert/strict");
const fs = require("fs");
const path = require("path");

const { sortChars } = require("./main");

const INPUT_CSV = path.join(__dirname, "..", "..", "input.csv");
const EXPECTED_CSV = path.join(__dirname, "..", "..", "expected-output.csv");

function readLines(filePath) {
    return fs.readFileSync(filePath, "utf8").split("\n").filter((l) => l.length > 0);
}

test("sortChars transforms each line to match expected-output.csv", () => {
    const inputLines = readLines(INPUT_CSV);
    const expectedLines = readLines(EXPECTED_CSV);

    assert.equal(inputLines.length, expectedLines.length);

    for (let i = 0; i < inputLines.length; i++) {
        assert.equal(sortChars(inputLines[i]), expectedLines[i]);
    }
});
