import { Provider } from "./components/ui/provider";
import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App";
import { ColorModeButton } from "./components/ui/color-mode";

ReactDOM.createRoot(document.getElementById("root")!).render(
  <React.StrictMode>
    <Provider>
      <App />
      <ColorModeButton />
    </Provider>
  </React.StrictMode>
);
