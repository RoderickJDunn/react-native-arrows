import { NativeModules } from "react-native";

const { RNArrows } = NativeModules;

console.log(RNArrows.createArrow());
export default RNArrows;
