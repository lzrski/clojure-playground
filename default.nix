with import <nixpkgs> {}; stdenv.mkDerivation {
  name = "Clojure";
  buildInputs = [
    clojure
    leiningen
    boot
  ];
  shellHook = ''
    # Start user's preffered shell
    exec ${builtins.getEnv "SHELL"}
  '';
}
