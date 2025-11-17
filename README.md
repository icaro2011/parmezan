# Parmezan

Parmezan fixes unbalanced or unexpected parens or other delimiters in Clojure files.

## API

The main API function is `borkdude.parmezan/parmezan` which takes a string of Clojure and returns a fixed string of Clojure.

## Command line

Options:

```
  --file  The file you want to fix
  --write Modify file in place
```

The CLI `-main` function is `borkdude.parmezan.cli/-main`.
The CLI exec function is `borkdude.parmezan.cli/exec`.

## Install

For babashka, you can install this tool with [bbin](https://github.com/babashka/bbin):

```
bbin install io.github.borkdude/parmezan
```

## License

MIT
